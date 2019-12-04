# Client

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.3.19.

## Development server
Open Intellij 
New - project from existing sources - gradle project 
Open build.gradle from server folder
Run build.gradle
Right click on build.gradle
Select import build.gradle folder
Right click on server or demo from right panel toolbar
Click Gradle Config 
Gradle should recognize all dependencies in build.gradle file now

Next, ensure you have the lastest Angular version by running: 
`npm i -g @angular/cli@latest`
`npm i --save-dev @angular/cli@latest`

You may have to install bootstrap into the project. To do so, run:
`npm install bootstrap --save`

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

Run `npm i -g @compodoc/compodoc` to add Compodoc for documentation. 

Run `compodoc -p [INSERT YOUR PATH TO tslint.json in project folder]`

Run `compodoc -s` to see our documentation on http://127.0.0.1:8080/

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
