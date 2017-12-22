export class Shop {
  id: string;
  picture: string;
  name: string;
  email: string;
  city: string;
  location: Point;

  constructor(id: string, picture: string, name: string, email: string, city: string, location: Point) {
  this.id = id;
  this.picture = picture;
  this.name = name;
  this.email = email;
  this.city = city;
  this.location = location;
}
}
export interface Point {
  X: number;
  Y: number;
}
