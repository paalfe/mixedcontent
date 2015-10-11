# Download TeamSpeak Client from http://www.teamspeak.com/, then run the following in a terminal to install. 
sh TeamSpeak3-Client-linux_*.run ; 
sudo mv TeamSpeak3-Client-linux_*/ /usr/local/teamspeak-client ; 
sudo chown -R root:root /usr/local/teamspeak-client ; 
sudo chmod -R 755 /usr/local/teamspeak-client ; 
sudo ln -s /usr/local/teamspeak-client/ts3client_runscript.sh /usr/local/bin/teamspeak-client ; 

# Add a launcher for the TeamSpeak Client.
sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/software%20(linux)/teamspeak/icon.png" -O /usr/local/teamspeak-client/icon.png ; 
sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/software%20(linux)/teamspeak/teamspeak-client.desktop" -O /usr/share/applications/teamspeak-client.desktop ; 
