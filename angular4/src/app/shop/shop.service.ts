import { Shop } from './shop-list/shop';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Response } from '@angular/http';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class ShopService {

  private apiUrl = 'api/customer';

  constructor(private http: Http) {   }


  findAll(): Promise<Shop[]>  {
    return this.http.get(this.apiUrl)
             .toPromise()
             .then(response => response.json() as Shop[])
             .catch(this.handleError);
  }
  private handleError(error: any): Promise<any> {
    console.error('Error', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }
}
