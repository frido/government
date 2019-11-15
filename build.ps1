param (
    [string]$m = "update"
 )

Set-Location -Path 'frontend'
ng build --prod
Set-Location -Path '..'

Set-Location -Path 'backend'
mvn package
Set-Location -Path '..'

Copy-Item -Path 'backend\target\samosprava-0.0.1-SNAPSHOT.jar' -Destination 'C:\home\repos\heroku\samosprava'

Set-Location -Path 'C:\home\repos\heroku\samosprava'
git add .
git status
git commit -m "$m"
git push

Set-Location -Path 'C:\home\repos\government'
