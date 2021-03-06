# Government

Page with resolutions of the Petrzalka City Council

You can see the list of resolutions with very detailed information like voting, budget, and people's responsibilities.

The ambition was to experiment with and compare similar technologies. Here is the [list of comparisons](https://petrzalka.info/government/) with short descriptions of my preferred choices. I have been working on a related web about [the used technologies and their alternatives](https://petrzalka.info/government-page/).

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=frido%3Asamosprava&metric=alert_status)](https://sonarcloud.io/dashboard?id=frido%3Asamosprava), [![codebeat badge](https://codebeat.co/badges/796fdd58-d3cb-4e82-b8a9-7e8765e8b3d8)](https://codebeat.co/projects/github-com-frido-government-master), 
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f7099cd093f6431eb759942b43f08dce)](https://www.codacy.com/app/frido/government?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=frido/government&amp;utm_campaign=Badge_Grade)
[![CircleCI](https://circleci.com/gh/frido/government.svg?style=svg)](https://circleci.com/gh/frido/government)

## Requirements

`java -version` - `java version "12.0.2" 2019-07-16`

`mvn -v` - `Apache Maven 3.6.1`

`node -v` - `v12.6.0`

`npm install` in frontend directory 

`npm install -g @angular/cli`

`git --version` - `git version 2.23.0.windows.1`

`heroku -v` - `heroku/7.33.3 win32-x64 node-v11.14.01`

## Build

in `frontend` directory:

```
ng build --prod
```

in `backend` directory:

```
mvn package
```

## Deploy

Copy `target/samosprava.jar` file to heroku git. Commit and push changes.
