# Rocks'n'Diamons: Supaplex - Install script for Ubuntu.
# https://gist.github.com/paalfe/b3364d7b30da6544bc8f

echo rocksndiamonds rocksndiamonds/select_games select Supaplex | sudo /usr/bin/debconf-set-selections
echo rocksndiamonds rocksndiamonds/begin select true | sudo /usr/bin/debconf-set-selections
sudo apt install rocksndiamonds
sudo wget https://www.googledrive.com/host/0B7lT5q7hw78DMUJyckRUOTZLa00/rocksndiamonds.png -O /usr/share/pixmaps/rocksndiamonds.png
sudo wget https://www.googledrive.com/host/0B7lT5q7hw78DMUJyckRUOTZLa00/rocksndiamonds.desktop -O /usr/share/applications/rocksndiamonds.desktop
sudo chmod +x /usr/share/applications/rocksndiamonds.desktop
sudo xdg-desktop-menu install --novendor /usr/share/applications/rocksndiamonds.desktop
sudo xdg-desktop-menu forceupdate


