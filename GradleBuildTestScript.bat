cd /d D:\Projects\GitTutorial\kodilla-course
del  build\libs\*.jar
call gradlew.bat build
if exist "build\libs\*.jar" (
    copy "build\libs\*.jar" "D:\Projects\GitTutorial\kodilla-course\project\"
    echo File *.jar coppied to folder \project.
) else (
    echo Compilation Error: File *.jar was not found in folder build/libs.
)