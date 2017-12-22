import { ShopService } from '../shop.service';
import { Point } from './point';
import { Shop } from './shop';
import { Component, OnInit, Input } from '@angular/core';
import { enableProdMode } from '@angular/core';
enableProdMode();

@Component({
  selector: 'app-shop-list',
  templateUrl: './shop-list.component.html',
  styleUrls: ['./shop-list.component.css'],
  providers: [ShopService]
})
export class ShopListComponent {
  @Input() customer: Shop;
}

