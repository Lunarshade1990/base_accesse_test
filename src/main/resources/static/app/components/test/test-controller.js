(function (angular) {
  'use strict';

  // Controllers
  angular.module('lunarshade.modules.test.controllers', []).

  /*controller('CategoryCreateController',
      ['$scope', 'CategoryService','$state',
        function ($scope, CategoryService,$state) {

          $scope.resetForm = function () {
            $scope.category = null;
          };

          $scope.create = function (category) {
            CategoryService.create(category).then(
                function (data) {
                  console.log("Success on create Category!!!")
                  $state.go('categories')
                }, function (err) {
                  console.log("Error on create Category!!!")
                });
          };
        }]).*/

  controller('TestListController',
      ['$scope', 'TestService',
        function ($scope, TestService) {
          TestService.find().then(function (data) {
            $scope.tests = data.data;
          }, function (err) {
            console.log(err);
          });
        }]);
})(angular);