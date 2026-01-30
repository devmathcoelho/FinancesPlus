import { Routes } from '@angular/router';

import { DashboardComponent } from './dashboard/dashboard.component';

export const routes: Routes = [
  // This makes the dashboard the landing page
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  
  // This defines the dashboard route
  { path: 'dashboard', component: DashboardComponent },
  
  { path: '**', redirectTo: 'dashboard' }
];