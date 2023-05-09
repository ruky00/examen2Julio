import { Component } from '@angular/core';
import { BookServiceService } from '../Service/book-service.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent {
  name: string="";

  constructor(private bookService: BookServiceService){}

  findBooks(){
    
  }


}
