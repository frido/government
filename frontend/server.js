const express = require('express')
const path = require('path')
const cors = require('cors')
const bodyParser = require('body-parser')

const ludiaBa = require('./db/petrzalka/ba-petrzalka-osoby')
const ludiaDt = require('./db/detva/dt-detva-osoby')

const uzneseniaBa = require('./db/petrzalka/ba-petrzalka-uznesenia')
const uzneseniaDt = require('./db/detva/dt-detva-uznesenia')

const interpelacie = require('./db/petrzalka/ba-petrzalka-interpelacie')

const rozpocetBa = require('./db/petrzalka/ba-petrzalka-rozpocet')
const rozpocetDt = require('./db/detva/dt-detva-rozpocet')

const zasadnutia = require('./db/petrzalka/ba-petrzalka-zasadnutia')
const spolky = require('./db/spolky')
const vystavba = require('./db/petrzalka/ba-petrzalka-vystavba')
const ciele = require('./db/petrzalka/ba-petrzalka-ciele')

const ludia = ludiaBa.ludia.concat(ludiaDt.ludia)
const uznesenia = uzneseniaBa.current.concat(uzneseniaDt.current)

const setCurrentMoney = (elem) => {
  elem.current = getCurrectYear(elem.money)
  elem.sub.forEach(function (sub) {
    setCurrentMoney(sub)
  })
}

const getCurrectYear = function (list) {
  return list[0]
}

const app = express()
const port = process.env.PORT || 1337

const allowedExt = [
  '.js',
  '.ico',
  '.css',
  '.png',
  '.jpg',
  '.woff2',
  '.woff',
  '.ttf',
  '.svg'
]

app.use(cors())
app.use(bodyParser.json())
app.use(express.static(path.join(__dirname, '/dist/samosprava')))

app.get('/api/:spolok/ciele', function (req, res) {
  // var spolok = spolky.spolky.find((x) => x.key === req.params.spolok);
  res.json({ data: ciele.current })
})

app.get('/api/:spolok/vystavba', function (req, res) {
  // var spolok = spolky.spolky.find((x) => x.key === req.params.spolok);
  res.json({ data: vystavba.vystavba })
})

app.get('/api/:spolok/rozpocet', function (req, res) {
  const spolok = spolky.spolky.find((x) => x.key === req.params.spolok)
  if (spolok.key === 'petrzalka') {
    let roz = rozpocetBa.rozpocet
    roz.vydavky.forEach(function (element) {
      setCurrentMoney(element)
    })
    roz.prijmy.forEach(function (element) {
      setCurrentMoney(element)
    })
    roz.current = getCurrectYear(roz.sumar)
    res.json({ data: roz })
  }
  if (spolok.key === 'detva') {
    let roz2 = rozpocetDt.rozpocet
    roz2.vydavky.forEach(function (element) {
      setCurrentMoney(element)
    })
    roz2.prijmy.forEach(function (element) {
      setCurrentMoney(element)
    })
    roz2.current = getCurrectYear(roz2.sumar)
    res.json({ data: roz2 })
  }
})

app.get('/api/:spolok/uznesenia', function (req, res) {
  const spolok = spolky.spolky.find((x) => x.key === req.params.spolok)
  if (spolok.key === 'petrzalka') {
    res.json({ data: uzneseniaBa.current.sort((a, b) => b.cislo - a.cislo) })
  }
  if (spolok.key === 'detva') {
    res.json({ data: uzneseniaDt.current.sort((a, b) => b.cislo - a.cislo) })
  }
  // if (req.query.previous === 'true') {
  //   res.json({ data: uznesenia.previous.sort((a,b) => a.cislo - b.cislo) } )
  // } else {
  //   res.json({ data: uznesenia.current.sort((a,b) => b.cislo - a.cislo) } )
  // }
})

app.get('/api/:spolok/interpelacie', (req, res) => {
  // let spolok = spolky.spolky.find(x => x.key === req.params.spolok)
  if (req.query.previous === 'true') {
    res.json({ data: interpelacie.previous })
  } else {
    res.json({ data: interpelacie.current })
  }
})

app.get('/api/vystavba/:id', (req, res) => {
  var id = parseInt(req.params.id)
  var stavba = vystavba.vystavba.find(x => x.id === id)
  res.json({ data: stavba })
})

app.get('/api/osoba/:id', (req, res) => {
  var id = parseInt(req.params.id)
  var osoba = ludia.find(x => x.id === id)
  res.json({ data: osoba })
})

app.get('/api/clenovia/:key', (req, res) => {
  var key = req.params.key
  var spolok = spolky.spolky.find(x => x.key === key)
  if (spolok.key === 'detva') {
    var clenovia = ludiaDt.ludia.map(x => {
      return ludiaDt.ludia.find(y => y.id === x.id)
    })// .sort((a, b) => b.current.hlasov - a.current.hlasov)
    res.json({ data: clenovia })
  }
  if (spolok.key === 'petrzalka') {
    var clenovia2 = spolok.clenovia.map(x => {
      return ludia.find(y => y.id === x)
    })// .sort((a, b) => b.current.hlasov - a.current.hlasov)
    res.json({ data: clenovia2 })
  }
})

app.get('/api/spolok/:key', (req, res) => {
  var key = req.params.key
  var spolok = spolky.spolky.find(x => x.key === key)
  res.json({ data: spolok })
})

app.get('/api/zasadnutie/:id', (req, res) => {
  var id = parseInt(req.params.id)
  var zasadnutie = zasadnutia.zasadnutia.find(x => x.id === id)
  res.json({ data: zasadnutie })
})

app.get('/api/uznesenie/:id', (req, res) => {
  var id = parseInt(req.params.id)
  var uznesenie = uznesenia.find(x => x.id === id)
  // previous us not supported anymore
  // if (uznesenie === null) {
  //   uznesenie = uznesenia.previous.find(x => x.id === id);
  // }
  res.json({ data: uznesenie })
})

app.get('/api/interpelacia/:id', (req, res) => {
  var id = parseInt(req.params.id)
  var interpelacia = interpelacie.current.find(x => x.id === id)
  if (interpelacia === null) {
    interpelacia = interpelacie.previous.find(x => x.id === id)
  }
  res.json({ data: interpelacia })
})

app.get('*', (req, res) => {
  if (allowedExt.filter(ext => req.url.indexOf(ext) > 0).length > 0) {
    res.sendFile(path.resolve(`dist/samosprava/${req.url}`))
  } else {
    res.sendFile(path.resolve('dist/samosprava/index.html'))
  }
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))
