'use strict';

angular.module('tianyaApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('home', {
                url: '/',
                data: {
                    authorities: []
                },
                views: {
                    'content@': {
                        templateUrl: 'ng/app/main/main.html',
                        controller: 'MainController'
                    }
                },
                resolve: {

                }
            });
    });
