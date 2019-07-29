[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=frido%3Asamosprava&metric=alert_status)](https://sonarcloud.io/dashboard?id=frido%3Asamosprava)

[![codebeat badge](https://codebeat.co/badges/796fdd58-d3cb-4e82-b8a9-7e8765e8b3d8)](https://codebeat.co/projects/github-com-frido-government-master)

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f7099cd093f6431eb759942b43f08dce)](https://www.codacy.com/app/frido/government?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=frido/government&amp;utm_campaign=Badge_Grade)

[![CircleCI](https://circleci.com/gh/frido/government.svg?style=svg)](https://circleci.com/gh/frido/government)

[![buddy pipeline](https://app.buddy.works/fridrichpeter/government/pipelines/pipeline/179493/badge.svg?token=7e655371adbe49225d540916417d681bfffc656638c4af50ee9f6b6c2e1801bd "buddy pipeline")](https://app.buddy.works/fridrichpeter/government/pipelines/pipeline/179493)

[![StackShare](http://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/samosprava/samosprava)

[Page](https://frido.github.io/government/)

# Government

## Requirements

`java -version` - `java version "12.0.2" 2019-07-16`

`mvn -v` - `Apache Maven 3.6.1`

`node -v` - `v12.6.0`

TODO: Heroku

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

# Stack Decision

## Javascript vs Typescript
I use _TypeScript_ because it is strongly typed superset of _JavaScript_ that provides many benefits. Integration with _IDE_ like _Visual Studio Code_ is excellent. The main benefit is maintainability. Many error can be caught before code running. Also _Angular_ recommends _TypeScript_ as better alternative to _JavaScript_ . Syntax is very easy to learn especially for people from the _Java_ world.


reinitializen on 20.7.2019
