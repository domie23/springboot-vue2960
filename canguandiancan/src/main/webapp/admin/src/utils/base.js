const base = {
    get() {
        return {
            url : "http://localhost:8080/canguandiancan/",
            name: "canguandiancan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/canguandiancan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "餐馆点餐系统"
        } 
    }
}
export default base
