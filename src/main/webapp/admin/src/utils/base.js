const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm602nm/",
            name: "ssm602nm",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "电子资源管理系统"
        } 
    }
}
export default base
