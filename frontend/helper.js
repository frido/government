const ludiaBa = require('./db/petrzalka/ba-petrzalka-osoby')
const ludiaDt = require('./db/detva/dt-detva-osoby')
const ludia = ludiaBa.ludia.concat(ludiaDt.ludia)

var input = process.argv.slice(2)
var i = 0
var j = input.length
var chunk = 2
var output = []
for (i = 0, j = input.length; i < j; i += chunk) {
  var temparray = input.slice(i, i + chunk)
  var name = temparray.join(' ').replace('MakovníkováMosná', 'Makovníková')
  var finding = ludia.find(l => l.meno.startsWith(name))
  output.push(finding ? finding.id : null)
}

console.log('[' + output.join(', ') + ']')
