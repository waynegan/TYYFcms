'use strict';

angular.module('tianyaApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


