import { Component, OnInit } from '@angular/core';
import { CourseService } from './courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {
  title = 'Course Offered';
  courses;
  constructor(service: CourseService) {

    this.courses = service.getCourses();

  }

  ngOnInit(): void {
  }

}
