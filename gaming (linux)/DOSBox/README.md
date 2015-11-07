USAGE:
- dosbox -conf dosbox.conf -conf games/GAME.conf

USAGE IF USING DOSBox SVN-Daum:
- dosbox -conf dosbox_svn-daum.conf -conf games/GAME.conf


------------------------------------------------------------------------------------------------------------------------------------------
gog.com Linux SH installers is usually created by Makeself combined with MojoSetup, use unzip to extract them. 
- http://www.info-zip.org/UnZip.html 
- https://apps.ubuntu.com/cat/applications/unzip/

Example extracting a single gog.com Linux SH installer: 
- unzip FILE.sh -d FOLDER

Example extracting multiple gog.com Linux SH installers: 
- for file in `ls *.sh`; do unzip $file -d `echo $file | cut -d . -f 1`; done


------------------------------------------------------------------------------------------------------------------------------------------
gog.com Windows EXE installers is usually created by Inno Setup, use innoextract to extract them. 
- http://constexpr.org/innoextract/ 
- https://apps.ubuntu.com/cat/applications/innoextract/

Example extracting a single gog.com Windows EXE installer: 
- innoextract FILE.exe -d FOLDER

Example extracting multiple gog.com Windows EXE installers: 
- for file in `ls *.exe`; do innoextract $file -d `echo $file | cut -d . -f 1`; done


------------------------------------------------------------------------------------------------------------------------------------------
gog.com MAC DMG installers is usually a compressed DMG with Apple HFS+ filesystem, use 7z (p7zip-full) to extract them. 
- http://p7zip.sourceforge.net/ 
- https://apps.ubuntu.com/cat/applications/p7zip-full/

Example extracting a single gog.com MAC DMG installer: 
- 7z x -o/tmp/ -y FILE.dmg && 7z x /tmp/4.hfs

Example extracting multiple gog.com MAC DMG installers: 
- for file in `ls *.dmg`; do 7z x -o/tmp/ -y $file && 7z x /tmp/4.hfs; done

Alternatively you can convert the DMG to IMG using dmg2img and then mount the IMG using gnome-disk-image-mounter (gnome-disk-utility). 
- http://vu1tur.eu.org/tools/
- https://apps.ubuntu.com/cat/applications/dmg2img/ 
- https://apps.ubuntu.com/cat/applications/gnome-disk-utility/


------------------------------------------------------------------------------------------------------------------------------------------

