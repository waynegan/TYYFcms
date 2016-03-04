'use strict';

angular.module('tianyaApp')
    .factory('Activate', function ($resource) {
        return $resource('api/activate', {}, {
            'get': { method: 'GET', params: {}, isArray: false}
        });
    });


