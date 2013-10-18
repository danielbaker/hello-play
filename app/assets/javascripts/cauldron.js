var cauldron = angular.module('cauldronApp', ['ngResource']);

cauldron.controller('postsController', function($scope, postsService){
   $scope.posts = postsService.getPosts();
});

cauldron.service('postsService', function($resource) {
    this.getPosts = function(){
        return $resource('/message').query()
    }
})