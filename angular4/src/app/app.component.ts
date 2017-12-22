import { Shop } from './shop/shop-list/shop';
import { ShopService } from './shop/shop.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';

  shops: Shop[];
  selectedShop: Shop;

  constructor(private dataService: ShopService) {}

  findAll() {
     return this.dataService.findAll().then(shops => this.shops = shops);
  }

  ngOnInit(): void {
     this.findAll();
  }

  onSelect(shp: Shop): void {
    this.selectedShop = shp;
  }
}
