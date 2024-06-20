import { Component } from '@angular/core';
import { DUMMY_PRODUCTS } from '../data/dummy-products';
import { CommonModule, NgFor } from '@angular/common';

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [ CommonModule],
  templateUrl: './products.component.html',
  styleUrl: './products.component.scss'
})
export class ProductsComponent {
  products = DUMMY_PRODUCTS;
}
