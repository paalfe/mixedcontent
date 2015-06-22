# http://www.teamspeak.com/
# Adds a launcher for TeamSpeak Client.

# Download TeamSpeak Client from http://www.teamspeak.com/.
# Run the following in a terminal.

sh TeamSpeak3-Client-linux_ARCH-VERSION.run ; 
sudo mv TeamSpeak3-Client-linux_ARCH/ /usr/local/teamspeak-client ; 
sudo ln -s /usr/local/teamspeak-client/ts3client_runscript.sh /usr/local/bin/teamspeak-client
sudo wget http://goo.gl/KZlbCI -O /usr/local/teamspeak-client/icon.png ; 
sudo wget http://goo.gl/CvRZ1Z -O /usr/share/applications/teamspeak-client.desktop ; 
