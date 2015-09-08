# RetroArch inside Steam - https://scottrice.github.io/Ice/. 
# Alterantively for SteamOS = https://github.com/sharkwouter/Ice. 

# Close Steam before you begin. 

sudo apt install python2.7 python-pip psutils ; 
wget https://github.com/scottrice/Ice/archive/master.zip -O /tmp/-.zip ; 
unzip /tmp/-.zip -d /tmp/ ; mkdir -pv $HOME/.ice/ ; cp -Rv /tmp/Ice-master/* $HOME/.ice/ ; 

wget pfk-ice-configs.....

cd $HOME/.ice/ ; 
sudo python setup.py install ; sudo chown -R $USER:$USER ./ ; 

python src/ice.py ; 

ERROR ERROR ERROR

...WIP...
WorkInProgress (NOT WORKING)
