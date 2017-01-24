echo off
echo %date:~8,2%-%time:~0,2%%time:~3,2%%time:~6,2% 
 mysqldump -uroot -proot it > "%cd%\it%date:~8,2%-%time:~0,2%%time:~3,2%%time:~6,2%.sql"
echo "%cd%\it%date:~8,2%-%time:~0,2%%time:~3,2%%time:~6,2%.sql"
exit
