import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { UserModule } from './user/user.module';
import { ShopModule } from './shop/shop.module';
import { UserComponent } from './user/user.component';
import { ShopListComponent } from './shop/shop-list/shop-list.component';
import { ShopService } from './shop/shop.service';
import { HttpModule } from '@angular/http';


const routes: Routes = [
  {path: 'user', component: UserComponent},
  {path: 'shop', component: ShopListComponent}
];

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    UserModule,
    ShopModule,
    HttpModule,
    RouterModule.forRoot(routes)
  ],
  providers: [ShopService],
  bootstrap: [AppComponent]
})
export class AppModule { }
