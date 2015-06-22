// declarion of internal packages of java to use
import java.util.*;
import java.io.*;
import java.net.*;
 
// encode the body in UTF-8 since we send the message as URL
String encBody = URLEncoder.encode(body,"UTF-8");

// declaration of objects later to be used
URL url = null;
BufferedReader reader = null;
String line = "";
int index = 0;

// run by loop on all recipients
while (index < recipients.length) {

	// Fix sms body - Make it Latin-1 Compliant
	String fixedEncBody = encBody.
	replaceAll("%C3%A6","%E6"). // &aelig;
	replaceAll("%C3%B8","%F8"). // &oslash;
	replaceAll("%C3%A5","%E5"). // &aring;
	replaceAll("%C3%86","%C6"). // &AElig;
	replaceAll("%C3%98","%D8"). // &Oslash;
	replaceAll("%C3%85","%C5"); // &Aring;

	// Fix sms number - Remove invalid characters
	String cleanedRecipient = recipients[index].
	replaceAll("\\D",""). // Removes any non-digits
	replaceAll("^0*",""); // Removes leading zeros

	// Fix sms number - Add the country prefix 47 for Norway if number is only 8 digits ( standard length for Norwegian cellular numbers )
	if (cleanedRecipient.length() == 8) {
	   String fixedRecipient = "47" + cleanedRecipient;
	}
	if (cleanedRecipient.length() != 8) {
	   String fixedRecipient = cleanedRecipient;
	}

	// PSWinCom Specific settings - You need to have an account to send messages see www.pswin.com for how to obtain one
	// For a complete list of possible settings see wiki.pswin.com some features require upgrade of account ( like SMS replace function) 
	// The URL is set with GatewayID in the SysAid config screen
	String smsUrl = gatewayId + "/http4sms/send.asp?" +
	"USER=" + user +
	"&PW="  + password +
	"&RCV=" + fixedRecipient +
	"&SND=" + senderId +
	"&TXT=" + fixedEncBody;
	com.ilient.server.IlientConf.logger.info("smsUrl: " + smsUrl );
	
	// build URL
	url = new URL(smsUrl);
	
	// Make the HTTP request
	reader = new BufferedReader(new InputStreamReader(url.openStream()));
	line = reader.readLine();
	
	// Logger indication
	com.ilient.server.IlientConf.logger.info("Running  Custom SMS:" + line );
	
	// increment the counter
	index++;
}


