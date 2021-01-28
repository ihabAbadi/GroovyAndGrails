function requestSuccess(d) {
    console.log('request Success')
    console.log(d)
    $("#resultCart").html(d)
}
function requestComplete(d) {
    console.log('request complete')
    console.log(d)
}
function requestLoading(d) {
    console.log('request loading')
    console.log(d)
}

function getProductByCategorie(data) {
    for(let p of data.products) {
        //Traitement des données récupérer en ajax
    }
}