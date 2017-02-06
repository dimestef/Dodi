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