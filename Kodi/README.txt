# Adds a launcher for Kodi that uses ALSA instead of PulseAudio (ALSA may work better for passthrough audio). Run the following in a terminal.

sudo rm /usr/local/bin/xbmc-alsa ; sudo rm /usr/share/applications/xbmc-alsa.desktop ; 	# Removes old XBMC ALSA launcher from previous instructions. 
sudo wget http://goo.gl/kXrH3W -O /usr/local/bin/kodi-alsa && sudo chmod a+x /usr/local/bin/kodi-alsa ; sudo wget http://goo.gl/qusvA4 -O /usr/share/applications/kodi-alsa.desktop ; 

