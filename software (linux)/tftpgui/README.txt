# https://code.google.com/p/tftpgui/
# Adds a launcher for TFTPgui - TFTP server with gui interface.
# Run the following in a terminal.

sudo apt install python3 python3-tk ;  
sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/software%20(linux)/tftpgui/org.gnome.tftpgui.policy" -O /usr/share/polkit-1/actions/org.gnome.tftpgui.policy ; 	# Adds the required PolicyKit file for TFTPgui needed for pkexec to be able to execute TFTPgui. 
wget "https://github.com/paalfe/mixedcontent/raw/master/software%20(linux)/tftpgui/tftpgui_3_1.tar" -O /tmp/tftpgui.tar ; sudo tar xvf /tmp/tftpgui.tar -C /usr/local/ ; 
sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/software%20(linux)/tftpgui/tftpgui" -O /usr/local/bin/tftpgui && sudo chmod a+x /usr/local/bin/tftpgui ; sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/software%20(linux)/tftpgui/tftpgui.desktop" -O /usr/share/applications/tftpgui.desktop ; 
