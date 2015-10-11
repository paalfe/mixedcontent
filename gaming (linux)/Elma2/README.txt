# Elma 2 - Install script for Ubuntu (32-bit only!).
# IN PROGRESS!
# http://wiki.elmaonline.net/Elma_2 and http://elmaonline.net/ 

wget http://users.jyu.fi/~mikkalle/Elma/cegui-0.8.3-Linux.sh -O /tmp/cegui.sh ; chmod +x /tmp/cegui.sh ; 
sudo sh /tmp/cegui.sh --prefix=/usr/local --exclude-subdir ; 
sudo ldconfig ; 
sudo apt install libfreeimage3 ; 
wget http://users.jyu.fi/~mikkalle/Elma/elma2-0.1.0-Linux-release.sh -O /tmp/elma2.sh ; chmod +x /tmp/elma2.sh ; 
sudo mkdir -pv /usr/share/games/elma2 ; sudo sh /tmp/elma2.sh --prefix=/usr/share/games/elma2 --exclude-subdir ; 

sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/gaming%20(linux)/Elma2/elma2.png" -O /usr/share/pixmaps/elma2.png ; 
sudo wget "https://raw.githubusercontent.com/paalfe/mixedcontent/master/gaming%20(linux)/Elma2/elma2.desktop" -O /usr/share/applications/elma2.desktop ; 

 (Work In Progress)
