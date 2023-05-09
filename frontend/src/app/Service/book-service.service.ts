import { Injectable } from '@angular/core';
import { Book } from '../Model/Book';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class BookServiceService {
  book: Book | undefined;
  constructor(private httpClient: HttpClient) { }
  
  getBooks() {
    return this.httpClient.get("/api/books");
  }
  
}
