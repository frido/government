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

## GitHub vs GitLab vs Bitbucket

_Bitbucket_ provides 5 private repositories for free that is I believe the best feature. _GitLab_ seems very simmilar to _GitHub_. The only reason I've choosen _GitHub_ is its popularity. It seems faster than _GitLab_, uglier than _Bitbucket_ and featured as others. The best open source projects are hosted on _GitHub_. Many applications are integrated with _GitHub_ like my favourite _GitKraken_.

## Gradle vs Maven

I use _Apache Maven_ because it is a standard. _Gradle_ is very good alternative, but _Gradle_ doesn't provide any advantage for our project. _Gradle_ is slower (without running daemon), need more resources and a learning curve is quite big. My project can not use a great flexibility of _Gradle_. On the other hand, _Maven_ is well-know tool integrated in many IDEs, _Dockers_ and so on.

## Atom vs Visual Studio Code

More than year ago I was looking for the best editor of _Angular2_ application and I've tried _Visual Studio Code_ and _Atom_. _Atom_ had performance issues that put me off completely to use it again. _Visual Studio Code_ became my main editor Typescript files (and partly editor of #Java files). I'm happy with _Visual Studio Code_ and I've never look back on _Atom_. There wasn't any reason to try _Atom_ again, because _Visual Studio Code_ fulfills my requirements very well. I use it for editing of TypeScript, HTML, Sass, JSON, Docker and Markdown.

## CircleCI vs Buddy

I started my continuous integration with _Buddy_. This is very good tool to start with. Easy configuration, many options and integrations, everything configurable via web page. My build proccess was configured in few minutes. Then I tried _CircleCI_ and I like it. After you read documentation, it is easy to configure. Builds are faster. I can store/share artifacts, test result. Build wolkflow description is stored in repository. Now I prefer to use _CircleCI_

## SourceTree vs GitKraken vs Sublime Merge

_GitKraken_ is the best git client so far. The user interface is very friendly. Everything is easy to do with this tool. A branch tree vizualization is very clear. I've tried _SourceTree_ and I got lost in such many panels. Also performance of _SourceTree_ is not as goot as _GitKraken_. I like _Sublime Merge_ but it doesn't have so many features as the other tools. I've choosen _GitKraken_ and as bonus I got _GitKraken Glo_ that is the next perfect tool.

## Wakatime

I use _WakaTime_ because it provides interesting information about my coding time. I have plugin for _Visual Studio Code_ and _IntelliJ IDEA_ (my favourite IDEs). _Wakatime_ uses fancy graphs to vizualize time spending on project. With _Wakatime_ I can improve my productivity by focusing on right project.

## Codacy vs CodeBeat vs SonarQube

It is very important to have clean code. To be sure that the code quality is not really bad I use a few tools. I love _SonarQube_ with many relevant hints and deep analysis of code. _CodeBeat_ isn't so detailed, but it can find complexity issues and duplications. _Codacy_ cannot find more bugs then your IDE. The winner for me is _SonarQube_ that shows me really relevant bugs in my code.

## Heroku vs OpenShift

I've never decided which one is better. _Heroku_ is easier to configure. _Openshift_ provide a better machine for free. _Heroku_ has many addons for free. I've chosen _Heroku_ because of easy initial set-up. I had deployment based on git push. I also tried direct deployment of jar file. Currently _Heroku_ runs my Docker image. _Heroku_ has very good documentation like for beginners. So if you want to start with something, let's follow _Heroku_. On the other hand _OpenShift_ seems like a PRO tool supported by @RedHat.

## PaperTrail vs LogEntries

Logentries, LogDNA, Timber.io, Papertrail and Sumo Logic provide free pricing plan for Heroku application. You can add these applications as add-ons very easily. After light preview of each tool I choosed to use _Papertrail_. 

