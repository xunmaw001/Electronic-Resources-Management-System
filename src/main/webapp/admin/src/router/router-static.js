import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import ziyuanbiaoyin from '@/views/modules/ziyuanbiaoyin/list'
    import bianmujiancha from '@/views/modules/bianmujiancha/list'
    import shujuku from '@/views/modules/shujuku/list'
    import ziyuanliebiao from '@/views/modules/ziyuanliebiao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import ziyuanjiansuo from '@/views/modules/ziyuanjiansuo/list'
    import shujukumingcheng from '@/views/modules/shujukumingcheng/list'
    import ziyuanshangchuan from '@/views/modules/ziyuanshangchuan/list'
    import xitongrizhi from '@/views/modules/xitongrizhi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/ziyuanbiaoyin',
        name: '资源标引',
        component: ziyuanbiaoyin
      }
      ,{
	path: '/bianmujiancha',
        name: '编目检查',
        component: bianmujiancha
      }
      ,{
	path: '/shujuku',
        name: '数据库',
        component: shujuku
      }
      ,{
	path: '/ziyuanliebiao',
        name: '资源列表',
        component: ziyuanliebiao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/ziyuanjiansuo',
        name: '资源检索',
        component: ziyuanjiansuo
      }
      ,{
	path: '/shujukumingcheng',
        name: '数据库名称',
        component: shujukumingcheng
      }
      ,{
	path: '/ziyuanshangchuan',
        name: '资源上传',
        component: ziyuanshangchuan
      }
      ,{
	path: '/xitongrizhi',
        name: '系统日志',
        component: xitongrizhi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
