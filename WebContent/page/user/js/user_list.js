angular.module("app").controller("userListController",['$scope',function($scope,i18nService){
	//i18nService.setCurrentLang('zh-cn');
	$scope.gridOptions = {
        data : 'myData',  
        //基础属性  
        enableSorting : true,//是否支持排序(列)  
        useExternalSorting : false,//是否支持自定义的排序规则  
        enableRowHeaderSelection : false,  
        enableGridMenu : false,//是否显示表格 菜单  
        showGridFooter: true,//时候显示表格的footer  
        enableHorizontalScrollbar : 1,//表格的水平滚动条  
        enableVerticalScrollbar : 1,//表格的垂直滚动条 (两个都是 1-显示,0-不显示)  
        selectionRowHeaderWidth : 30,  
        enableCellEditOnFocus:false,//default为false,true的时候单击即可打开编辑(cellEdit为true的时候,需要引入'ui.grid.cellNav')  
        //分页属性  
        enablePagination: true, //是否分页,default为true  
        enablePaginationControls: true, //使用默认的底部分页  
        paginationPageSizes: [10, 15, 20], //每页显示个数选项  
        paginationCurrentPage:1, //当前的页码  
        paginationPageSize: 10, //每页显示个数  
        paginationTemplate:"<div></div>", //自定义底部分页代码  
        totalItems : 0, // 总数量  
        useExternalPagination: true,//是否使用分页按钮            
        //选中  
        rowTemplate: "<div ng-dblclick=\"grid.appScope.onDblClick(row)\" ng-repeat=\"(colRenderIndex, col) in colContainer.renderedColumns track by col.colDef.name\" class=\"ui-grid-cell\" ng-class=\"{ 'ui-grid-row-header-cell': col.isRowHeader }\" ui-grid-cell></div>",//双击行事件  
        enableFooterTotalSelected: true, // 是否显示选中的总数,default为true,如果显示,showGridFooter 必须为true  
        enableFullRowSelection : true, //是否点击行任意位置后选中,default为false,当为true时,checkbox可以显示但是不可选中  
        enableRowHeaderSelection : true, //是否显示选中checkbox框 ,default为true  
        enableRowSelection : true, // 行选择是否可用,default为true;  
        enableSelectAll : true, // 选择所有checkbox是否可用，default为true;   
        enableSelectionBatchEvent : true, //default为true  
        modifierKeysToMultiSelect: false ,//default为false,为true时只能按ctrl或shift键进行多选,这个时候multiSelect必须为true;  
        multiSelect: true ,// 是否可以选择多个,默认为true;  
        noUnselect: false,//default为false,选中后是否可以取消选中  
        selectionRowHeaderWidth:30 ,//default为30,设置选择列的宽度  
        //api   
        onRegisterApi : function (gridApi) {  
          
        },  
         
        //导出(只支持csv,扩展性不太好)  
        exporterAllDataFn: function(){//导出全部  
        },  
        exporterCsvColumnSeparator: ',',  
        exporterCsvFilename:'testdown.csv',  
        exporterFieldCallback : function ( grid, row, col, value ){//导出回调可以过滤条件  
          
            return value;  
        },  
        exporterHeaderFilterUseName : true,  
        exporterMenuCsv : true,  
        exporterMenuLabel : "Export",  
        exporterMenuPdf : true,  
        exporterOlderExcelCompatibility : false,//是否兼容低版本excel  
        exporterPdfCustomFormatter : function ( docDefinition ) {  
         docDefinition.styles.footerStyle = { bold: true, fontSize: 10 };  
         return docDefinition;  
        },  
        exporterPdfFooter :{   
                             text: '',   
                             style: ''   
                           },  
        exporterPdfDefaultStyle : {  
          fontSize: 11,font:'simblack' //font 设置自定义字体  
        },  
        exporterPdfFilename:'testdown.pdf',  
        exporterPdfFooter: function(currentPage, pageCount) {   
               return currentPage.toString() + ' of ' + pageCount;   
        },  
        exporterPdfHeader : function(currentPage, pageCount) {   
           return currentPage.toString() + ' of ' + pageCount;   
        },  
        exporterPdfMaxGridWidth : 720,  
        exporterPdfOrientation : 'landscape',//  'landscape' 或 'portrait' pdf横向或纵向  
        exporterPdfPageSize : 'A4',// 'A4' or 'LETTER'   
        exporterPdfTableHeaderStyle : {  
         bold: true,  
         fontSize: 12,  
         color: 'black'  
        },  
        exporterPdfTableLayout : null,  
        exporterPdfTableStyle: {  
         margin: [0, 5, 0, 15]  
        },  
        exporterSuppressColumns : ['name'],//过滤不需要的列  
        exporterSuppressMenu: false,  
        //列属性设置  
         columnDefs: [{   field: 'name',   
                         displayName: '名字',   
                         width: '100', //宽度设置  
                         enableColumnMenu: false,// 是否显示列头部菜单按钮  
                         //enableHiding: false,  
                         //suppressRemoveSort: true,  
                         enableCellEdit: false, // 是否可编辑  
                         cellEditableCondition:function($scope){  
                            return boolean;//是否编辑控制  
                         },  
                         visible:true,//是否显示default为true,  
                         cellTemplate : '<a href="" ng-click="grid.appScope.viewPages(row.entity);">{{row.entity.name==1?"重写":""}}</a>',//重写cell  
                         cellClass: function(grid, row, col, rowRenderIndex, colRenderIndex) {  
                          //做一些判断。。。  
                          return 'red'//自定义样式   
                        },  
                         //cell下拉  
                         editableCellTemplate: 'ui-grid/dropdownEditor',  
                         editDropdownOptionsArray: [],//[{name:1,nameText:'Yoko'}]  
                         editDropdownIdLabel: 'name',//id  
                         editDropdownValueLabel: 'nameText',//显示的名字  
                           
                         cellFilter:"nameFilet"//过滤器  
                     }  
                       
                    ],  
    };  
    var myData=[{name:''}];  
}])