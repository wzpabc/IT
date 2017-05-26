DECLARE @root VARCHAR(1000)='$(dirpath)\osb_qa_'+cast(newid() AS VARCHAR(36))+'.bak'
SELECT @root
BACKUP DATABASE [osb_qa] TO  DISK =@root
WITH NOFORMAT, NOINIT,  NAME = N'osb_qa-Full Database Backup', SKIP, NOREWIND, NOUNLOAD,  STATS = 10
GO
