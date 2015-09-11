--- GNS3 ICON AND GNS3 LAUCNHER ---
# gns3-48x48.png - Add GNS3 icon in size 48x48 to the hicolor theme. 
sudo wget http://goo.gl/aJC1w4 -O /usr/share/icons/hicolor/48x48/apps/gns3.png ; 
# Update the icon cache of the hicolor theme. 
sudo gtk-update-icon-cache -f /usr/share/icons/hicolor/ ; 
# gns3.desktop - Add GNS3 laucnher. 
sudo wget http://goo.gl/xSlmwT -O /usr/share/applications/gns3.desktop ; 


--- EXTRAS, NOT NEEDED! ---
gns3-48x48.png = /usr/share/icons/hicolor/48x48/mimetypes/application-x-gns3.png
gns3-32x32.png = /usr/share/icons/hicolor/32x32/apps/gns3.png
gns3-16x16.png = /usr/share/icons/hicolor/16x16/apps/gns3.png
