# https://code.google.com/p/tftpgui/
# Adds a launcher for TFTPgui - TFTP server with gui interface.
# Run the following in a terminal.

sudo apt install python3 python3-tk ;  
sudo wget http://goo.gl/w1bA1d -O /usr/share/polkit-1/actions/org.gnome.tftpgui.policy ; 	# Adds the required PolicyKit file for TFTPgui needed for pkexec to be able to execute TFTPgui. 
wget http://goo.gl/vo9WSl -O /tmp/tftpgui.tar ; sudo tar xvf /tmp/tftpgui.tar -C /usr/local/ ; 
sudo wget http://goo.gl/y3iQSE -O /usr/local/bin/tftpgui && sudo chmod a+x /usr/local/bin/tftpgui ; sudo wget http://goo.gl/MGvMul -O /usr/share/applications/tftpgui.desktop ; 
