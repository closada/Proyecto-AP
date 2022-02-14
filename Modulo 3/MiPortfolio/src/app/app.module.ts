import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { HeaderComponent } from './components/header/header.component';
import { ProfileInfoComponent } from './components/profile-info/profile-info.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { EducationComponent } from './components/education/education.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProjectsComponent } from './components/projects/projects.component';
import { ChartsComponent } from './components/charts/charts.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProfileInfoComponent,
    ExperienceComponent,
    EducationComponent,
    SkillsComponent,
    ProjectsComponent,
    ChartsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
