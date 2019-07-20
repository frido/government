[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=frido%3Agovernment&metric=alert_status)](https://sonarcloud.io/dashboard?id=frido%3Agovernment)

[![codebeat badge](https://codebeat.co/badges/796fdd58-d3cb-4e82-b8a9-7e8765e8b3d8)](https://codebeat.co/projects/github-com-frido-government-master)

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f7099cd093f6431eb759942b43f08dce)](https://www.codacy.com/app/frido/government?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=frido/government&amp;utm_campaign=Badge_Grade)

[![CircleCI](https://circleci.com/gh/frido/government.svg?style=svg)](https://circleci.com/gh/frido/government)

[![buddy pipeline](https://app.buddy.works/fridrichpeter/government/pipelines/pipeline/179493/badge.svg?token=7e655371adbe49225d540916417d681bfffc656638c4af50ee9f6b6c2e1801bd "buddy pipeline")](https://app.buddy.works/fridrichpeter/government/pipelines/pipeline/179493)

# Government

## Requirements

`java -version` - `java version "12.0.2" 2019-07-16`

`mvn -v` - `Apache Maven 3.6.1`

`node -v` - `v12.6.0`

## Build

in `frontend` directory:

```
ng build --prod
```

in `government` directory:

```
mvn package
```

build docker:

```
docker build .
```

upload to Heroku:

```
heroku container:push web --app samosprava
heroku container:release web --app samosprava
```

reinitializen on 20.7.2019