app.directive("club", function () {
    return{
        restrict: "E",
        templateUrl: "templates/club.html",
        link: function (scope) {

        }
    }
});

app.directive("footballer", function () {
    return{
        restrict: "E",
        templateUrl: "templates/footballer.html",
        scope: false,
        link: function (scope) {
        }
    }
});

app.directive("skill", function () {
    return{
        restrict: "E",
        templateUrl: "templates/skill.html",
        scope: false,
        link: function (scope) {
        }
    }
});


app.directive("addClub", function () {
    return{
        restrict: "E",
        templateUrl: "templates/addClub.html",
        scope: false,
        link: function (scope) {
        }
    }
});

app.directive("addFootballer", function () {
    return{
        restrict: "E",
        templateUrl: "templates/addFootballer.html",
        scope: false,
        link: function (scope) {
        }
    }
});

app.directive("makeContract", function () {
    return{
        restrict: "E",
        templateUrl: "templates/makeContract.html",
        scope: false,
        link: function (scope) {
        }
    }
});

app.directive("clubManager", function () {
    return{
        restrict: "E",
        templateUrl: "templates/clubManager.html",
        scope: false,
        link: function (scope) {
        }
    }
});

app.directive("addNewManager", function () {
    return{
        restrict: "E",
        templateUrl: "templates/addNewManager.html",
        scope: false,
        link: function (scope) {
        }
    }
});
