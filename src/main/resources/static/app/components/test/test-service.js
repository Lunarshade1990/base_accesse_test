(function (angular) {
  'use strict';

  /* Services */
  angular.module('lunarshade.modules.test.services', []).
  service('TestService', ['$http',
    function ($http) {

      var serviceAddress = 'http://localhost:8080';
      var urlCollections = serviceAddress + '/lunarshade/test';
//      var urlBase = serviceAddress + '/api/category/';

      this.find = function () {
        return $http.get(urlCollections);
      };

      /*this.findOne = function (id) {
        return $http.get(urlBase + id);
      };

      this.create = function (data) {
        return $http.post(urlBase, data);
      };

      this.update = function (data) {
        return $http.put(urlBase + '/id/' + data._id, data);
      };

      this.remove = function (data) {
        return $http.delete(urlBase + '/id/' + data._id, data);
      };*/
    }
  ]);
})(angular);