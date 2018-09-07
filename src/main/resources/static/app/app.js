
(function (angular) {
  'use strict';

  angular.module('lunarshade', [
    'ui.router',
    'lunarshade.controllers',
    'lunarshade.services'
  ]).config(function($stateProvider,$httpProvider){

    $stateProvider.state('test',{
      url:'/testpage',
      templateUrl:'app/components/test/view/testpage.html',
      controller:'TestListController'
    });

  }).run(function($state){
    $state.go('test');
  });
})(angular);
