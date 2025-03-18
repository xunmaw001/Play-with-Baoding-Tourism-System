
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

{
	name: '我的订单',
	url: '../order/list.jsp'
},

{
	name: '我的地址',
	url: '../address/list.jsp'
},

{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '景区线路',
	url: './pages/jingquxianlu/list.jsp'
}, 
{
	name: '飞机火车',
	url: './pages/feijihuoche/list.jsp'
}, 
{
	name: '酒店门票',
	url: './pages/jiudianmenpiao/list.jsp'
}, 
{
	name: '景点美食',
	url: './pages/jingdianmeishi/list.jsp'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.jsp'
}, 
{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspmju51h/index.jsp";

var cartFlag = false

var chatFlag = false


chatFlag = true
cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"景区线路","menuJump":"列表","tableName":"jingquxianlu"}],"menu":"景区线路管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"飞机火车","menuJump":"列表","tableName":"feijihuoche"}],"menu":"飞机火车管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"酒店门票","menuJump":"列表","tableName":"jiudianmenpiao"}],"menu":"酒店门票管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"门票类型","menuJump":"列表","tableName":"menpiaoleixing"}],"menu":"门票类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","报表"],"menu":"景点美食","menuJump":"列表","tableName":"jingdianmeishi"}],"menu":"景点美食管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"旅游论坛 ","tableName":"forum"}],"menu":"旅游论坛 "},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"旅游资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","修改","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","修改","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看","修改","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","修改","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","修改","删除"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"景区线路列表","menuJump":"列表","tableName":"jingquxianlu"}],"menu":"景区线路模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"飞机火车列表","menuJump":"列表","tableName":"feijihuoche"}],"menu":"飞机火车模块"},{"child":[{"buttons":["购买","查看"],"menu":"酒店门票列表","menuJump":"列表","tableName":"jiudianmenpiao"}],"menu":"酒店门票模块"},{"child":[{"buttons":["查看评论","查看"],"menu":"景点美食列表","menuJump":"列表","tableName":"jingdianmeishi"}],"menu":"景点美食模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","修改","查看","删除"],"menu":"旅游论坛 ","tableName":"forum"}],"menu":"旅游论坛 "},{"child":[{"buttons":["查看","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","删除","确认收货","修改"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["新增","查看","修改","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","删除"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","删除"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"景区线路列表","menuJump":"列表","tableName":"jingquxianlu"}],"menu":"景区线路模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"飞机火车列表","menuJump":"列表","tableName":"feijihuoche"}],"menu":"飞机火车模块"},{"child":[{"buttons":["购买","查看"],"menu":"酒店门票列表","menuJump":"列表","tableName":"jiudianmenpiao"}],"menu":"酒店门票模块"},{"child":[{"buttons":["查看评论","查看"],"menu":"景点美食列表","menuJump":"列表","tableName":"jingdianmeishi"}],"menu":"景点美食模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
