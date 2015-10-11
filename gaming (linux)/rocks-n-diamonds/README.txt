# Rocks'n'Diamonds: Supaplex - Install script for Ubuntu.
echo rocksndiamonds rocksndiamonds/select_games select Supaplex | sudo /usr/bin/debconf-set-selections ; 
echo rocksndiamonds rocksndiamonds/begin select true | sudo /usr/bin/debconf-set-selections ; 
sudo apt install rocksndiamonds ; 

# Add a Rocks'n'Diamonds launcher.
sudo wget https://raw.githubusercontent.com/paalfe/mixedcontent/master/gaming%20(linux)/rocks-n-diamonds/rocksndiamonds.png -O /usr/share/pixmaps/rocksndiamonds.png ; 
sudo wget https://raw.githubusercontent.com/paalfe/mixedcontent/master/gaming%20(linux)/rocks-n-diamonds/rocksndiamonds.desktop -O /usr/share/applications/rocksndiamonds.desktop ; 
