import { Component } from '@angular/core';
import { DUMMY_USERS } from '../data/dummy-users';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.scss'
})
export class UserComponent {

  connectedUser = DUMMY_USERS[0];

}
