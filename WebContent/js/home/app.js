var app = angular.module('app', ['oc.lazyLoad','ui.router','ngAnimate','ui.grid', 'ui.grid.autoResize', 'ui.grid.cellNav', 'ui.grid.selection', 'ui.grid.resizeColumns', 'ui.grid.pagination', 'ui.grid.pinning']);
app.config(function($stateProvider, $urlRouterProvider, $ocLazyLoadProvider) {
	/*路由重定向 $urlRouterProvider:如果没有路由引擎能匹配当前的导航状态，那它就会默认将路径路由至 home.html, 
	 *这个页面就是状态名称被声明的地方. */
    $urlRouterProvider.otherwise('/home');
    $stateProvider.state('home', {
        url: '/home',
        templateUrl: 'tpl/home.html'
    })
    .state('home.list', {
        url: '/list',
        templateUrl: 'tpl/home-list.html'
    })
    .state('home.paragraph', {
        url: '/paragraph',
        template: 'I could sure use a scoop of ice-cream. '
    })
    .state('user', {
        url: '/user',
        templateUrl: 'page/user/user_menus.html'
    })
    .state('user.userList', {
        url: '/userList',
        templateUrl: 'page/user/userList.html',
        /*resolve: {
            des: function ($ocLazyLoad) {
                var ctrl = $ocLazyLoad.load('page/user/js/user_list.js');
                console.log(ctrl)
                return ctrl;
            }
        } */
        resolve: {
          	deps: ['$ocLazyLoad',
	            function( $ocLazyLoad){
	            	console.log($ocLazyLoad.load('page/user/js/user_list.js'))
	              return $ocLazyLoad.load('page/user/js/user_list.js');
          		}
	        ]
        }
        //template: 'page/user/userList.html'
        
    })
    .state('user.userTree', {
        url: '/userTree',
        templateUrl: 'page/user/userTree.html'
    })
    .state('menu', {
        url: '/menu',
        templateUrl: 'page/menu/menu_menus.html'
    })
    .state('menu.menuList', {
        url: '/menuList',
        template: 'I am menuList. '
    })
    .state('menu.authority', {
        url: '/authority',
        template: 'I am authority. '
    })
    .state('about', {
        url: '/about',
        template: 'I am menuList. '
    });
});

