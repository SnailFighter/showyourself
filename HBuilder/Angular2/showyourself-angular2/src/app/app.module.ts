import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import {RouterModule} from '@angular/router';

import { AppComponent }  from './app.component';
import { HeroDetailComponent  } from './hero-detail.component';
import { DashboardComponent } from './dashboard.component';
	
import { HeroesComponent } from './heroes.component';
import {HeroService} from './hero.service';




@NgModule({
  imports:      [   BrowserModule,
		  			FormsModule,
		  			RouterModule.forRoot([
		  				{
		  					path:'detial/:id',
		  					compoent:HeroDetailComponent
		  				},
		  				{
		  					path:'heroes',
		  					component:HeroesComponent
		  				},
		  				{
		  					path:'dashboard',
		  					component:DashboardComponent
		  				}
		  				
		  			])
		  		],
		  			
  declarations: [   AppComponent,
  					HeroDetailComponent,
  					HeroesComponent,
  					DashboardComponent
  					
  				 ],
  providers:	[ HeroService ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
