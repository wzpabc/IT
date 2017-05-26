

echo off
echo %date:~8,2%-%time:~0,2%%time:~3,2%%time:~6,2% 
sqlcmd -E -S.\sqlexpress -ibackupsqlserver.sql -vdirpath="C:\Users\upw023\git\IT\IT\src\database" -W
echo "%cd%\it%date:~8,2%-%time:~0,2%%time:~3,2%%time:~6,2%.sql"
rem sqlcmd -E -S.\sqlexpress -ibackupsqlserver.sql -vdirpath=%cd% -W
exit