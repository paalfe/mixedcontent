http://www.pswin.com/Produkter/Gateway/Grensesnitt.aspx

- HTTP/HTTPS
Alle typer meldinger kan sendes vhja. en enkel HTTP POST operasjon. Kun for enkeltvise meldinger, ikke bulk SMS.
http://www.pswin.com/Portals/84/Dokument/Grensesnitt/http.pdf

HTTP  = http://sms.pswin.com/http4sms/send.asp
        (failover: http://smsbackup.pswin.com/http4sms/send.asp) 

HTTPS = https://secure.pswin.com/http4sms/send.asp
        (failover: https://securebackup.pswin.com/http4sms/send.asp) 
		
EXAMPLE: http://sms.pswin.com/http4sms/send.asp?USER=username&PW=secretpassword&RCV=4712345678&SND=PSWinComSMS&TXT=SMS+fra+PSWinComSMS

---------------------------------------------------------------------------------------------------------------------

https://wiki.pswin.com/Gateway%20HTTP%20API.ashx
https://wiki.pswin.com/SSL%20certificates.ashx

https://support.pswin.com/hc/no
https://support.pswin.com/hc/no/sections/200057733-Integrering
https://support.pswin.com/hc/no/articles/200234577-Hvordan-kan-jeg-teste-konto-med-enkle-verkt%C3%B8y-

---------------------------------------------------------------------------------------------------------------------

Place customSMSProvider.groovy at
  LINUX   = /var/lib/tomcat7/webapps/sysaid/WEB-INF/conf/customSMSProvider.groovy
  WINDOWS = C:\Program Files\SysAidServer\root\WEB-INF\conf\customSMSProvider.groovy

SysAid -> Settings -> Integration -> Text message
  Provider Class     = com.ilient.util.CustomSMSProvider
  Gateway ID - HTTP  = http://sms.pswin.com
  Gateway ID - HTTPS = https://secure.pswin.com
  User Name	         = YOURUSERNAME
  Password           = YOURPASSWORD
  Sender ID	         = IKT%20Support

  
 NOTE1: "Provider Class" is case sensitive and must be exactly "com.ilient.util.CustomSMSProvider"
 
 NOTE2: To add space in "Sender ID" use %20
 
