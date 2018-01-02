'use strict';

var path = require('path');
var webpack = require('webpack');
var autoprefixer = require('autoprefixer');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

module.exports = {
    entry: {
        index: './js/index.js'
    },
    output: {
        path: path.resolve(__dirname, 'build'),
        filename: '[name].bundle.js',
        chunkFilename: '[id].bundle.js',
    },
    debug: true,
    devtool: 'source-map',
    module: {
        loaders: [
            {
                test: /(\.scss|\.css)$/,
                loader: ExtractTextPlugin.extract('style!css!postcss!less!', 'css?sourceMap&modules&importLoaders=1&localIdentName=[name]__[local]___[hash:base64:5]!postcss!'),
            },
            {
                test: /\.less$/,
                loader: 'style!css!less'
            },
            {
                test: /\.(js|jsx)$/,
                loader: 'react-hot!babel',
                exclude: /(node_modules|bower_components)/,
            },
            {
                test: /\.(eot|svg|ttf|woff|woff2)\w*/,
                loader: 'file'
            },
            {
                test: /\.json$/,
                loader: 'json-loader'
            },
            {
                test: /\.(png|jpg)$/,
                loader: 'url-loader?limit=8192'
            }
        ]
    },
    postcss: function () {
        return [
            autoprefixer({browsers: ['last 5 versions']})
        ];
    },
    resolve: {
        root: [
            path.resolve(__dirname),
            path.resolve(__dirname, 'js', 'fw', 'lib')
        ]
    },
    plugins: [
        new ExtractTextPlugin('bundle.css', {allChunks: true}),
        new webpack.optimize.CommonsChunkPlugin('common.bundle.js'),
        new HtmlWebpackPlugin({
            title: 'KCoins',
            description: '',
            username: 'amiras',
            filename: 'index.html',
            inject: 'body',
            template: 'index.html_vm',
            favicon: 'img/kcoin_small_20.png',
            hash: false
        })
    ]
};
