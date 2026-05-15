# Changelog

## 0.5.0 (2026-05-15)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/yolken/yolken-test6-java/compare/v0.4.0...v0.5.0)

### Features

* **api:** Add contact info ([6050d91](https://github.com/yolken/yolken-test6-java/commit/6050d91daeea7382922179f1b9ab904d38199105))
* **api:** manual updates ([561c621](https://github.com/yolken/yolken-test6-java/commit/561c621d9ed8abc8e7c54d798b3ea0a777bdd94a))
* **api:** manual updates ([43d7a74](https://github.com/yolken/yolken-test6-java/commit/43d7a741f82267b8d17d061db9d56226e1e1a7fa))
* **api:** manual updates ([8b1c6a9](https://github.com/yolken/yolken-test6-java/commit/8b1c6a95ce636d3ae2a5f994b9dbd47c6559e022))
* **api:** manual updates ([1073702](https://github.com/yolken/yolken-test6-java/commit/1073702df111b82ccb55f1ab61f2b497c40a9552))
* **api:** manual updates ([12f79f3](https://github.com/yolken/yolken-test6-java/commit/12f79f3d03672ad6000d055dbc0d3239564a6a1a))
* **api:** manual updates ([9d1614e](https://github.com/yolken/yolken-test6-java/commit/9d1614e46998a6a60fff99dabdced8f67fb68916))
* **api:** manual updates ([2f6f6ec](https://github.com/yolken/yolken-test6-java/commit/2f6f6ec19fb529cd424418c577a365ab210fc1c4))
* **api:** manual updates ([8c75177](https://github.com/yolken/yolken-test6-java/commit/8c7517790419435db7b26f5699fe52e55ba3fce1))
* **api:** manual updates ([e3a111a](https://github.com/yolken/yolken-test6-java/commit/e3a111a8d3b7d7dfbeaab7fa36a2e8df8ff563f6))
* **api:** manual updates ([a76f402](https://github.com/yolken/yolken-test6-java/commit/a76f402af3d4df4272e318b7f9c2e61d6dc4b624))
* **api:** manual updates ([056795e](https://github.com/yolken/yolken-test6-java/commit/056795e44a87179e28a2d5e9b4dcd1d641b892c4))
* **api:** manual updates ([6489c0d](https://github.com/yolken/yolken-test6-java/commit/6489c0d2a9ea7fe7cfec035cd6ab2fedd4abe9d1))
* **api:** manual updates ([07a9ab2](https://github.com/yolken/yolken-test6-java/commit/07a9ab271dbefa7e0d6e908d7be3ba108b520ccb))
* **api:** manual updates ([9ce856d](https://github.com/yolken/yolken-test6-java/commit/9ce856d1d7c836bea3f5ae4b60902386a1d48f41))
* **client:** add connection pooling option ([8dcd780](https://github.com/yolken/yolken-test6-java/commit/8dcd7806f26e0d0f9b022685e78edb313c7f343e))
* **client:** add more convenience service method overloads ([2d3c6f0](https://github.com/yolken/yolken-test6-java/commit/2d3c6f0749d90aca4d695a681fed9533e9c04fcf))
* **client:** improve logging ([2ffcaf6](https://github.com/yolken/yolken-test6-java/commit/2ffcaf662db6b88bd520731c10b21e0a36498107))
* **client:** send `X-Stainless-Kotlin-Version` header ([13537e9](https://github.com/yolken/yolken-test6-java/commit/13537e935f966ac730fe3a26f2cd2723b0361199))
* support setting headers via env ([4092bda](https://github.com/yolken/yolken-test6-java/commit/4092bda87f04ed3df02068ccbb1499013b5543fb))


### Bug Fixes

* **client:** disallow coercion from float to int ([a556012](https://github.com/yolken/yolken-test6-java/commit/a5560120abd9f4b5d6058f4649b8c66750cc0518))
* **client:** fully respect max retries ([c405350](https://github.com/yolken/yolken-test6-java/commit/c4053503045addae87275fdac6c0fb1dc2e5d204))
* **client:** incorrect `Retry-After` parsing ([de1a701](https://github.com/yolken/yolken-test6-java/commit/de1a701512456fed5029909fcde74c1df28ca297))
* **client:** preserve time zone in lenient date-time parsing ([5d653f1](https://github.com/yolken/yolken-test6-java/commit/5d653f1a501f0d4960b9234655911a1a58be594e))
* **client:** send retry count header for max retries 0 ([c405350](https://github.com/yolken/yolken-test6-java/commit/c4053503045addae87275fdac6c0fb1dc2e5d204))
* date time deserialization leniency ([cc3e920](https://github.com/yolken/yolken-test6-java/commit/cc3e920671fd9543c104264f7040b0bd47af490a))
* **docs:** fix mcp installation instructions for remote servers ([885583b](https://github.com/yolken/yolken-test6-java/commit/885583bbaf72b9ea152f6b842671e923c4ee1756))
* **tests:** add missing query/header params ([a56c03a](https://github.com/yolken/yolken-test6-java/commit/a56c03ae57dd191a61a17cd06db563254c590509))


### Chores

* **ci:** skip uploading artifacts on stainless-internal branches ([54e8fa3](https://github.com/yolken/yolken-test6-java/commit/54e8fa3cb231cd3fe081a5ebe07ce2836bf7179e))
* **ci:** upgrade `actions/github-script` ([e3269c1](https://github.com/yolken/yolken-test6-java/commit/e3269c1b2cd577697dd8c63ac0022af5513955ea))
* **ci:** upgrade `actions/setup-java` ([d890545](https://github.com/yolken/yolken-test6-java/commit/d89054582873592205050207cc37c273165f9345))
* configure new SDK language ([c71e4fe](https://github.com/yolken/yolken-test6-java/commit/c71e4fe517e79b3b2ad61bbd3a63b0810e3f5755))
* drop apache dependency ([8db1ebf](https://github.com/yolken/yolken-test6-java/commit/8db1ebf25fe24301e8ecc14c0849c0a4fba8dc52))
* **internal:** allow passing args to `./scripts/test` ([d546efa](https://github.com/yolken/yolken-test6-java/commit/d546efa0c1a4512d20485a1b65f9b2145dd4a13c))
* **internal:** bump palantir-java-format ([9fd0b6c](https://github.com/yolken/yolken-test6-java/commit/9fd0b6cca7b44d95efdc1e038187058ae8496fd2))
* **internal:** codegen related update ([817d02d](https://github.com/yolken/yolken-test6-java/commit/817d02d9b3998a0232463718504ddaaa9366ecfd))
* **internal:** codegen related update ([a936ca8](https://github.com/yolken/yolken-test6-java/commit/a936ca8d38a03114e5490f14cf1739335976bb3c))
* **internal:** codegen related update ([ff7315e](https://github.com/yolken/yolken-test6-java/commit/ff7315e49f857cec6121b636a62ae97bfb883c23))
* **internal:** codegen related update ([723edd0](https://github.com/yolken/yolken-test6-java/commit/723edd011e09915886a7d7c73c24baa77fcc7b74))
* **internal:** codegen related update ([b8a25d2](https://github.com/yolken/yolken-test6-java/commit/b8a25d21f0abe6d50a24ef9d82ddabc37aae3707))
* **internal:** codegen related update ([33ef9a3](https://github.com/yolken/yolken-test6-java/commit/33ef9a303778eb0bf199b26eda08cd0bfbcaa747))
* **internal:** codegen related update ([d11745c](https://github.com/yolken/yolken-test6-java/commit/d11745c40b036dde9d51f1f73c4e1529b460f181))
* **internal:** codegen related update ([039ed94](https://github.com/yolken/yolken-test6-java/commit/039ed947495c4c2c2d7315b09d253406d3e52973))
* **internal:** codegen related update ([e80cc1d](https://github.com/yolken/yolken-test6-java/commit/e80cc1da73880d25642c481e0e0bdbd8efb200bb))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([baaa19f](https://github.com/yolken/yolken-test6-java/commit/baaa19f421aa34299d63c24b9b0bcf59c01fd9ab))
* **internal:** depend on packages directly in example ([c405350](https://github.com/yolken/yolken-test6-java/commit/c4053503045addae87275fdac6c0fb1dc2e5d204))
* **internal:** expand imports ([f8cd31a](https://github.com/yolken/yolken-test6-java/commit/f8cd31a36cda09ee91abe9fdd94d81811f655256))
* **internal:** improve maven repo docs ([4ffaff5](https://github.com/yolken/yolken-test6-java/commit/4ffaff5d4026818fcc18376573c8a2cebf09d2cf))
* **internal:** make `OkHttp` constructor internal ([99ca40b](https://github.com/yolken/yolken-test6-java/commit/99ca40b99c9651dafd2584a2e17868b26955b140))
* **internal:** remove mock server code ([e6e7204](https://github.com/yolken/yolken-test6-java/commit/e6e7204a074c027186f12ff4397913ad615bad20))
* **internal:** tweak CI branches ([688b139](https://github.com/yolken/yolken-test6-java/commit/688b1394ac815c6c5e31eb8addaec774a65efb23))
* **internal:** update `actions/checkout` version ([75fdc86](https://github.com/yolken/yolken-test6-java/commit/75fdc86fd30b837e8fc774ae999fef39a851daac))
* **internal:** update `TestServerExtension` comment ([451795c](https://github.com/yolken/yolken-test6-java/commit/451795ceedeb99577fc55df66145101628d9d21e))
* **internal:** update maven repo doc to include authentication ([dcc82a2](https://github.com/yolken/yolken-test6-java/commit/dcc82a2ce23beeaba9b3bbaa6f3426021757d057))
* **internal:** upgrade AssertJ ([ab764fe](https://github.com/yolken/yolken-test6-java/commit/ab764febe6415de7e2165a95613b556968e43432))
* make `Properties` more resilient to `null` ([b09f19b](https://github.com/yolken/yolken-test6-java/commit/b09f19bdd59b66836407e2a3a58bc76321fcbce7))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/yolken/yolken-test6-java/issues/3240) in tests ([cc3e920](https://github.com/yolken/yolken-test6-java/commit/cc3e920671fd9543c104264f7040b0bd47af490a))
* update mock server docs ([57d8be3](https://github.com/yolken/yolken-test6-java/commit/57d8be3251b2fb67edd8753099d25697f6228b4c))
* update placeholder string ([7fee313](https://github.com/yolken/yolken-test6-java/commit/7fee3138009b3dfeb0889e26328e79d0e1e94368))

## 0.4.0 (2026-01-15)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/yolken/yolken-test6-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** manual updates ([2282f76](https://github.com/yolken/yolken-test6-java/commit/2282f7641bfe12c298ebb06345132e2314efd69c))
* **api:** manual updates ([580d9e1](https://github.com/yolken/yolken-test6-java/commit/580d9e12e6e5a232e72d1c6d0890d87c0ee573f5))
* **api:** manual updates ([f92bf68](https://github.com/yolken/yolken-test6-java/commit/f92bf6864ed4d94d5b3804554b5c741e863cdf0a))
* **api:** manual updates ([9e3565a](https://github.com/yolken/yolken-test6-java/commit/9e3565a30b02b27ff8e94fb4bc0768aaf5ec9c46))


### Chores

* **internal:** clean up maven repo artifact script and add html documentation to repo root ([d14a294](https://github.com/yolken/yolken-test6-java/commit/d14a29486b1436f39bf073b6c8316f65662386e9))

## 0.3.0 (2026-01-13)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/yolken/yolken-test6-java/compare/v0.2.0...v0.3.0)

### Features

* **api:** manual updates ([1c8fbac](https://github.com/yolken/yolken-test6-java/commit/1c8fbac99617c9bb6bf3f8225605e26f2483209c))
* **api:** manual updates ([54a85e7](https://github.com/yolken/yolken-test6-java/commit/54a85e75cd5e4e7549340aec0122086e0ba14e73))


### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([aa86e0f](https://github.com/yolken/yolken-test6-java/commit/aa86e0fe16b00b60eb1d34d38479dca14cd955da))

## 0.2.0 (2026-01-12)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/yolken/yolken-test6-java/compare/v0.1.0...v0.2.0)

### Features

* **api:** manual updates ([27f7181](https://github.com/yolken/yolken-test6-java/commit/27f71817e77d7d47e344cebf92c5b12c63361c72))
* **api:** manual updates ([201148a](https://github.com/yolken/yolken-test6-java/commit/201148a9764e8a850e938500e4f1e4a7dd6c99f1))
* **api:** manual updates ([c6502b1](https://github.com/yolken/yolken-test6-java/commit/c6502b1f9a74a0c1e0f2c42f139ce62d42cf364c))
* **client:** allow configuring dispatcher executor service ([81042f0](https://github.com/yolken/yolken-test6-java/commit/81042f0e3da2854f45dac49230caaf1d9ec8fa1a))

## 0.1.0 (2026-01-06)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/yolken/yolken-test6-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([f291a7f](https://github.com/yolken/yolken-test6-java/commit/f291a7f6f803ea7d4c371689ba08fe7fe6772530))


### Chores

* update SDK settings ([d383327](https://github.com/yolken/yolken-test6-java/commit/d383327b9c5d1b30e2dfaccbf98adf8efeac5386))
